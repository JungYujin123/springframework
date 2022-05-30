/**
 * 
 */

//1부터 10까지의 합
function proc1(){
	let sum=0;
	
	for(i=0; i<=10; i++){
		sum +=i;
	}
	document.getElementById('d1').textContent = sum;
}

proc2= function(){
	let sum=0;
	
	/*//방식 1
	for(i=2; i<=200; i+=2){
		sum+=i;
	}
	//방식 2
	for(i=1; i<=200; i++){
		if(i%2==0) sum+=i;
	}*/
	//방식 3
	for(i=1; i<=200; i++){
		if(i%2!=0){
			continue;
		}
		sum+=i;		
	}
	document.getElementById('d2').textContent = sum;
	
}

proc3=function(){
	//<h4>3. 입력값을 더하고 0 입력시 출력</h4>
	let sum=0;
	let str="";
	while(true){
		let a= parseInt(prompt("값을 입력하세요"));
		if(a==0){
			break;
		}else{
			sum+=a;
			str+=a+ " ";
		}
	
	}
	let rst = `입력한 값 ${str} <br>`;
	rst += `합 : ${sum}`;
	document.getElementById('d3').innerHTML = rst;
}

//각각 1~10까지 더한 합이 3의 배수인 값
function proc4(){
	let rst = "";
	for(i=1; i<=10; i++){
		for(j=1; j<=10; j++){
			if((i+j)%3!=0) continue;
			rst += `${i} + ${j} = ${i+j} <br>`;
		}
	}
	document.getElementById('d4').innerHTML = rst;
}

proc5=function(){
	let rst="";
	for(i=1; i<=100; i++){
		if(i%2==0 || i%3==0){
			rst+=i+" ";
		}
	}
	document.getElementById('d5').innerHTML = rst;	
}

//6. 두수의 합이 100이상일 때
proc6=function(){
	let str1="두 수의 합이 100이하인 값들 <br>";
	let str2=`두 수의 합이 100이상인 값들 <br>`;
	
	while(true){
		let a=parseInt(prompt("첫번째 수 입력"));
		let b=parseInt(prompt("두번째 수 입력"));
		if(a==0 && b==0){
			break;
		}
		let sum=a+b;
		if(sum<100){
			str1+=`${a} ${b} <br>`;
			continue;
		}
		str2+=`${a} ${b} <br>`;
	}
		document.getElementById('d6').innerHTML=str1+"<br>";
		document.getElementById('d6').innerHTML+=str2
		.0;
}