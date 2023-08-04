package com.xworkz.app;
import com.xworkz.app.Brand;

public class BrandUtil {
	
	public static void brandName(Brand brand) {
		brand.Style();
		System.out.println(brand.name);
		if(brand instanceof LocalBrand) {
			System.out.println("Brand is LocalBrand");
			LocalBrand localBrand=new LocalBrand();
			localBrand.LocalStyle();
			System.out.println(localBrand.localName);
		}
		if(brand instanceof NationalBrand) {
			System.out.println("Brand is NationalBrand");
			NationalBrand nationalBrand=new NationalBrand();
			nationalBrand.NationalStyle();
			System.out.println(nationalBrand.nationalName);
		}
		if(brand instanceof DuplicateBrand) {
			System.out.println("Brand is DuplicateBrand");
			DuplicateBrand duplicateBrand=new DuplicateBrand();
			duplicateBrand.DuplicateStyle();
			System.out.println(duplicateBrand.duplicateName);
		}
		if(brand instanceof InternationalBrand) {
			System.out.println("Brand is InterNationalBrand");
			InternationalBrand internationalBrand=new InternationalBrand();
			internationalBrand.InternationalStyle();
			System.out.println(internationalBrand.internationalName);
	
	
		}
	}
}
