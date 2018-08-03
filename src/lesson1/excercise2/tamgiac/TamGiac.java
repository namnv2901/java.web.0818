package lesson1.excercise2.tamgiac;

public class TamGiac {
	private double canhA;
	private double canhB;
	private double canhC;
	
	public double getCanhA() {
		return canhA;
	}
	
	public void setCanhA(double canhA) {
		this.canhA = canhA;
	}
	
	public double getCanhB() {
		return canhB;
	}
	
	public void setCanhB(double canhB) {
		this.canhB = canhB;
	}
	
	public double getCanhC() {
		return canhC;
	}
	
	public void setCanhC(double canhC) {
		this.canhC = canhC;
	}

	public TamGiac(double canhA, double canhB, double canhC) {
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}
	
	public void loaiTamGiac() {
		if(canhA + canhB > canhC && canhA + canhC > canhB && canhB + canhC > canhA) {
			if(canhA == canhB || canhB == canhC || canhA == canhC) {
				if(canhA == canhB && canhA == canhC) {
					System.out.println("Day la tam giac deu");
				}
				else if(canhA*canhA + canhB*canhB == canhC*canhC || canhA*canhA + canhC*canhC == canhB*canhB || canhC*canhC + canhB*canhB == canhA*canhA) {
					System.out.println("Day la tam giac vuong can");
				}
				else {
					System.out.println("Day la tam gia can");
				}
			}
			else if(canhA*canhA + canhB*canhB == canhC*canhC || canhA*canhA + canhC*canhC == canhB*canhB || canhC*canhC + canhB*canhB == canhA*canhA){
				System.out.println("Day la tam giac vuong");
			}
			else {
				System.out.println("Day la tam giac thuong");
			}
		}
		else {
			System.out.println("Ba canh khong tao thanh tam giac");
		}
	}
	
	public Double tinhChuVi() {
		return canhA + canhB + canhC;
	}
	
	public Double tinhDienTich() {
		Double p = tinhChuVi()/2;
		return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
	}
}
