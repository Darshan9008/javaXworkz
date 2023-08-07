package com.xworkz.boot;
import com.xworkz.app.DuplicateBrand;
import com.xworkz.app.LocalBrand;
import com.xworkz.app.InternationalBrand;
import com.xworkz.app.NationalBrand;
import com.xworkz.app.Brand;
import com.xworkz.app.BrandUtil;




public class BrandRunner {
	
	System.out.println("Invoking main in BrandRunner");
	System.out.println("----------------------");
	
	Brand brand=new Brand();
	
	LocalBrand localBrand=new LocalBrand();
	
	NationalBrand nationalBrand=new NationalBrand();
	
	DuplicateBrand duplicateBrand=new DuplicateBrand();
	
	InternationalBrand internationalBrand=new InternationalBrand();
	BrandUtil.brandName(brand);
	
	System.out.println("----------------------");
	BrandUtil.brandName(localBrand);
	
	System.out.println("----------------------");
	BrandUtil.brandName(nationalBrand);
	
	System.out.println("----------------------");
	BrandUtil.brandName(duplicateBrand);
	
	System.out.println("----------------------");
	BrandUtil.brandName(internationalBrand);
	
	
	
	
	
	

}
