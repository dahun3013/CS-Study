package Problem20211106;

#include <bits/stdc++.h>
        using namespace std;

//금요일 9:30 ~ 18:00
//월요일 13:00 ~ 18:00

        string solution(double time, vector<vector<string>> plans) {
        const double FS_TIME = 9.5;
        const double FE_TIME = 18;
        const double MS_TIME = 13;
        const double ME_TIME = 18;
        string answer = "";

        for (unsigned i = 0; i < plans.size(); ++i) {
        string dest = plans[i][0];
        int sTime = 0;
        int eTime = 0;
        double needTime = 0.0;

        //Str(Time) -> Int(Time) include PM, AM
        if (plans[i][1].size() == 3)
        sTime = plans[i][1].substr(1, 2) == "PM" ? plans[i][1][0] - 48 + 12 : plans[i][1][0] - 48;
        else
        sTime = plans[i][1].substr(2, 2) == "PM" ? stoi(plans[i][1].substr(0, 2)) + 12 : stoi(plans[i][1].substr(0, 2));
        if (plans[i][2].size() == 3)
        eTime = plans[i][2].substr(1, 2) == "PM" ? plans[i][2][0] - 48 + 12 : plans[i][2][0] - 48;
        else
        eTime = plans[i][2].substr(2, 2) == "PM" ? stoi(plans[i][2].substr(0, 2)) + 12 : stoi(plans[i][2].substr(0, 2));

        //calc needTime
        if (sTime < FE_TIME) {
        if (sTime > FS_TIME)
        needTime += FE_TIME - sTime;
        else
        needTime += FE_TIME - FS_TIME;
        }

        if (eTime > MS_TIME) {
        if (eTime < ME_TIME)
        needTime += eTime - MS_TIME;
        else
        needTime += ME_TIME - MS_TIME;
        }

        //isPossible
        if (time >= needTime)
        answer = dest;
        }

        return answer;
        }

        int main() {
        cout << solution(3.5, {{"홍콩", "11PM", "9AM"}, {"엘에이", "3PM", "2PM"}});
        }