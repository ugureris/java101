import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str="javabackend     ";
        String string="javaBAckend";
        String st1="";
        System.out.println(str.charAt(2));  //indexe göre karakteri verir
        System.out.println(str.codePointAt(1)); //indexe göre karakterin unicode'u
        System.out.println(str.compareTo(string));  //unicode'a göre eşitliği sorgular
        System.out.println(str.compareToIgnoreCase(string));    //unicode'a göre eşitliği sorgular. büyük küçük ayrımı yok
        System.out.println(str.concat("dev"));  //sonuna ekleme
        System.out.println(str.contains("ava"));    //içeriyorsa true
        System.out.println(str.endsWith("end"));    //sonuna bakıyor
        System.out.println(str.indexOf("v"));   //indexi döndürüyor
        System.out.println(st1.isEmpty());  //boş olup olmadığına bakıyor
        System.out.println(str.length());   //uzunluğu
        System.out.println(str.replace("a","i"));   //karakteri değiştiriyor
        System.out.println(string.replaceFirst("a","i"));   //ilk bulduğu karakteri değiştiriyor

        String[] sp=str.split("b");
        System.out.println(Arrays.toString(sp)); // o harften itibaren böler

        System.out.println(str.startsWith("ja"));   //başlangıca bakıyor
        System.out.println(str.substring(4,11));    //istediğimiz kısmı bölüyor
        System.out.println(string.toLowerCase());   //bütün karakterleri küçültür
        System.out.println(str.toUpperCase());  //bütün harfleri büyütür
        System.out.println(str.trim()); //başındaki ve sonundaki boşlukları almaz

    }
}