package Day26foreach;

public class Foreach1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	iki String array olusturunuz ve bu array�lerdeki ortak elemanlari 
		//For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		//Ortak eleman yoksa ekrana �Ortak eleman yok� yazdiriniz
	String arr[]= {"b","c","b"};
	String arr2[]= {"a","r","o"};
	int flag=0;
	
	for (String each1 : arr) {
		
		for (String each2 : arr2) {
			if (each1.equals(each2)) {
				System.out.println(each1);
			flag++;
			}
		}
	}
	if (flag==0) {
		System.out.println("ortak elamn yok ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
