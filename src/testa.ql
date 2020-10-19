





def 打印指定行数三角形(line){
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


def 打印九九乘法表(){
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


def 打印等边三角形(){
    for( i=1;i<=5;i++){ // 图形共5行，i表示行数
        for( j1=5; i<=j1; j1--){
            print(" ")
        }
        for( j2=1; j2<=i; j2++){
            print("*")
        }
        for( j3=1; j3<i; j3++){
            print("*")
        }
        println()
    }
}



def 打印等边三角形2(){
    for (i = 1; i <= 5; i++) {
        for( blank = 4; blank >= i; blank--) {
            print(" ")
        }
        for(raw = 1;raw <= 2*i-1; raw++) {
            print("*")
        }
        println()
    }
}

def 递归累加求和(n){
    if(n>1){
        return n+递归累加求和(n-1)
    }else{
        return 1
    }
}



def 冒泡排序(){
    
    arr = [-12,3,2,34,5,8,1,1232,443,454,656,77,7,8,22,1212]
    //println(arr[99])
    println("排序前：")
    println(arr)
    for(i= 0;i<arr~~-1;i++) {//外层循环控制排序趟数
        for(j = 0;j<arr~~-i-1;j++) {//内层循环控制每一趟排序多少次
            if(arr[j]>arr[j+1]) {
                temp = arr[j]
                arr[j]= arr[j+1]
                arr[j+1]= temp
            }
        }
    }
    println("排序后：")
    println(arr)
}






def 打印直角三角形(line){
    
    for(i=0;i<line;i++) {
            for(j=0;j<line-i;j++) {
                print("*")
            }
            println()  
        }
}


def 打印三角形右边(){
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

def 递归求乘阶(num)
{
	if (num == 1)
	{
		return 1
	}
	else
	{
        return num*递归求乘阶(num - 1)
        
        /*
        递归调用
        把函数递归的函数放在后面
        正确的：
        return num*递归求乘阶(num - 1)

        错误的
        return 递归求乘阶(num - 1)*num
        */
	}
}































