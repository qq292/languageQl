
//打印九九乘法表
def fg1(){
    i=1
    
	while(i<=9){
		j = 1
		while(j<=i){
			answer = i*j
			print(j+"*"+i+"="+answer+"  ")
			j=j+1
		}
        println()
        i=i+1
	}
}

def fg6(){
    for( i=1;i<=5;i++){ // 图形共5行，i表示行数
            for( j=5; i<=j; j=j-1) // 打印左侧1号空白三角形部分
                {print(" ")}
            for( j=1; j<=i; j=j+1) // 打印2号三角形部分
                {print("*")}
            for( j=1; j<i; j=j+1)  // 打印3号三角形部分
                {print("*")}
            println()
        }

}
//--------------------------------------------------------------------------------------------------------
fg6()
break




def fg2(){

    i =1
    while(i<=100){
        //判断i是否能被bai5整除（i除以5 ，取余，du若余数不为0，则表示不能zhi整除）dao
        if(i%5!=0){
            println(i)
        }
    //改变i的值（1--100）
    i=i+1
    }


}

def fg3(line){
    i=1
    j=line
    z=line 
    k=1
    while(j>0){                 //控制行j=5输出5行
        while(i<=z-j+1) {       // 控制列
            print(k+" ")        //k控制输出值baiCducout<<k<<"";
            i=i+1              // 循环条件，控制跳出循环
            k=k+1           //输出值递zhi增
        }
        i=1                     //i值重设为1
        println()               //换行C:cout<<endl;
        j=j-1// 循环条件
    }
}


//打印直角三角形
def fg4(line){
    
    for(i=0;i<line;i++) {
            for(j=0;j<line-i;j++) {
                print("*")
            }
            println()  
        }
}
fg4(20)/*20行*/
//break

def fg5(){
    for(i=0;i<4;i=i++) {
        for(j=0;j<3-i;j=j++) {
            print(" ")
        }
        for(j=0;j<i+1;j=j++) {
            print("*")
        }
        println()
    }
    return
 
}

def fg6(n){
   if(n==1){
       return 1
    }else{
        return n+fg6(n-1)
    }
}


def a6(n){
    if(n==1) {
        return 1
    
    }else{
        return n+a6(n-1)
    }
     
}


def Mul( num)
{
	if (num == 1)
	{
		return 1
	}
	else
	{
		return num*Mul(num - 1)
	}

}

println(Mul(150))
//println(a6(100))
























