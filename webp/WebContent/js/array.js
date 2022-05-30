/**
 * 
 */
function proc1(){
	//리터럴 방식으로 배열생성
	let fruit = ["딸기" , "수박", 100, 12.34, "복숭아", true];	
	print(fruit, "d1");
//	document.getElementById('d1').textContent = str;
}


proc2=function(){
	let fruit = new Array("참외","바나나","망고");	
	print(fruit, "d2");
}

proc3=function(){
	let fruit = new Array();	
	fruit[0]="자두";
	fruit[1]="배";
	fruit[2]="파인애플";
	fruit[3]="샤인머스캣";
	fruit[4]="포도";
	print(fruit , "d3");
}

function print(fruit,d){
	let str = "";
	for(i=0; i<fruit.length; i++){
		str += fruit[i]+" ";
	}
	document.getElementById(d).innerText = str;
}