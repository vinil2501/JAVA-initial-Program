package org.initial;

public class Method_Overloading {
	//Bio-Data
public void Human(String name) {
	System.out.println("Name= "+name);
}
public void Human(int no) {
	System.out.println("Reg No= "+no);

}public void Human(double age) {
	System.out.println("Age= "+age);

}public void Human(char g) {
	System.out.println("Gender= "+g);

}public void Human(float hig) {
	System.out.println("Hight= "+hig+"inch");
}
public void Human() {
	System.out.println("Bio-data");
}
public static void main(String[] args) {
	Method_Overloading data=new Method_Overloading();
    data.Human();
    data.Human("M.Vnil");
    data.Human(2036542);
    data.Human('M');
    data.Human(33d);
    data.Human(5.2f);
}

}

