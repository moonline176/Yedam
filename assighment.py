#첫째 줄에 양의 정수 A가 주어진다.
#둘째 줄에 연산자 + 또는 *가 주어진다.
#셋째 줄에 양의 정수 B가 주어진다
#A와 B는 모두 10의 제곱형태이고, 길이는 최대 100자리이다.

num1 = int(input())
cal = input()
num2 = int(input())
if(cal == "*"): 
    print(num1*num2) 
else: 
    print(num1+num2)
