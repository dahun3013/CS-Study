using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class player : MonoBehaviour
{
    public float maxSpeed;
    public float jumpPower;
    private Rigidbody2D rigid;
    private SpriteRenderer spriteRenderer;
    private Animator anim;
    
    // Start is called before the first frame update
    void Start()
    {
        
    }
    void Awake()
    {
        rigid = GetComponent<Rigidbody2D>();
        spriteRenderer = GetComponent<SpriteRenderer>();
        anim = GetComponent<Animator>();
    }
    
    // Update is called once per frame
    void Update()
    {
        //jump
        if(Input.GetButtonDown("Jump")&& !anim.GetBool("isJump"))
        {
            rigid.AddForce(Vector2.up * jumpPower, ForceMode2D.Impulse);
            anim.SetBool("isJump", true);
        }
        //가속멈춤
        if (Input.GetButtonUp("Horizontal"))
        {
            //normalized 벡터의 크기를 단위로 표시
            rigid.velocity = new Vector2(rigid.velocity.normalized.x*0.2f, rigid.velocity.y);
        }

        if (Input.GetButton("Horizontal"))
        {
            spriteRenderer.flipX = Input.GetAxisRaw("Horizontal") < 0 ;
        }

        if (Mathf.Abs(rigid.velocity.x) > 0.3)
            anim.SetBool("isWalk", true);
        else    
            anim.SetBool("isWalk", false);
    }
    void FixedUpdate()
    {
        float h = Input.GetAxisRaw("Horizontal");
        rigid.AddForce(Vector2.right * h, ForceMode2D.Impulse);
        if (rigid.velocity.x > maxSpeed)
            rigid.velocity = new Vector2(maxSpeed, rigid.velocity.y);
        else if (rigid.velocity.x < maxSpeed * (-1))
            rigid.velocity = new Vector2(maxSpeed * (-1), rigid.velocity.y);
        
        //Landing Platform
        if (rigid.velocity.y < 0)
        {
            Debug.DrawRay(rigid.position, Vector3.down, new Color(0,1,0));
            RaycastHit2D rayHit = Physics2D.Raycast(rigid.position, Vector3.down, 1, LayerMask.GetMask("Platform"));
            
            if (rayHit.collider != null)
            {
                Debug.Log(rayHit.distance);
                if(rayHit.distance<1.0f)
                    anim.SetBool("isJump", false);
            }
        }
    }
}
