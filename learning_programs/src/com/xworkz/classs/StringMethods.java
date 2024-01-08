package com.xworkz.classs;

public class StringMethods {

	public static void main(String[] args) {


		
		String name="darshan";
		System.out.println("whether blank or not  : "+name.isBlank());
		System.out.println(name.charAt(2));
		System.out.println(name.concat("ramesh"));
		System.out.println(name.contains("d"));
		System.out.println(name.endsWith("n"));
		System.out.println(name.indent(3));
		System.out.println(name.indexOf(3));
		System.out.println(name.isEmpty());
		System.out.println(name.length());
		System.out.println(name.lastIndexOf("r"));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.getBytes());
		System.out.println(name.repeat(2));
		System.out.println(name.replaceAll("d", "r"));
		System.out.println(name.startsWith("d"));
		System.out.println(name.toCharArray());
		System.out.println(name.hashCode());
		System.out.println(name.indent(2));
		System.out.println(name.isEmpty());
        System.out.println(name.indexOf("d"));	
        System.out.println(name.intern());
		System.out.println(name.lines());
		System.out.println(name.chars());
		String[] a=name.split("a");
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		
		}
		
		String[] b=name.split("a",2);
		for(int i=0;i<b.length;i++) {
		
		System.out.println(b[i]);
		}
		
		
		System.out.println(name.lastIndexOf("n"));
		System.out.println(name.matches("dars"));
		System.out.println(name.matches("darshan"));
		System.out.println(name.repeat(2));
		System.out.println(name.trim());
		System.out.println(name.substring(4));
		System.out.println(name.substring(2, 4));
		System.out.println(name.stripIndent());
		
		System.out.println(name.concat("ram").equals("darshanram"));
		System.out.println(name.concat("ra").equals("darshanram"));
		System.out.println(name.indexOf(name.charAt(2)));
		System.out.println(name.concat("r").compareTo("da"));
		System.out.println(name.stripLeading());
		System.out.println(name.toString());
		System.out.println(name.codePoints());
		
		
		
		
        
	
		
		
		
		
		
		
		
		
		
		
	}

}
