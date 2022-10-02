var names=new Array();
names[0]="Yaakov";
names[1]="Tien";
names[2]="Thanh";
names[3]="alex";
names[4]="john";
names[5]="frank";
names[6]="apple";
names[7]="samsung";
names[8]="laura";
names[9]="jim";


for (var i = 0; i < names.length; i++) {
	if(names[i].charAt(0)==='J'|| names[i].charAt(0)==='j'){
        console.log("Goodbye "+ names[i])
	}
	else{
		console.log("Hello "+ names[i])
	}
}