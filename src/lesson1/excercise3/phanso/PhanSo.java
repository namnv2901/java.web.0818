package lesson1.excercise3.phanso;

public class PhanSo {
	private int tuSo;
	private int mauSo;
	
	public int getTuSo() {
		return tuSo;
	}
	
	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}
	
	public int getMauSo() {
		return mauSo;
	}
	
	public void setMauso(int mauSo) {
		this.mauSo = mauSo;
	}
	
	public PhanSo() {
		
	}

	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	
	public void in() {
		rutgon();
		System.out.println(tuSo + "/" + mauSo);
	}
	
	public PhanSo rutgon() {
		int a = this.tuSo;
		int b = this.mauSo;
		int temp = 1;
		while (b != 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		PhanSo p = new PhanSo();
		p.tuSo = this.tuSo/a;
		p.mauSo = this.mauSo/a;
		return p;
	}
	
	public void nghichdao() {
		rutgon();
		System.out.println(mauSo + "/" + tuSo);
	}
	
	public PhanSo cong(PhanSo ps1, PhanSo ps2) {
		PhanSo p = new PhanSo();
		p.tuSo = ps1.tuSo * ps2.mauSo + ps1.mauSo * ps2.tuSo;
		p.mauSo = ps1.mauSo * ps2.mauSo;
		p.rutgon();
		return p;
	}
	
	public PhanSo tru(PhanSo ps1, PhanSo ps2) {
		PhanSo p = new PhanSo();
		p.tuSo = ps1.tuSo * ps2.mauSo - ps1.mauSo * ps2.tuSo;
		p.mauSo = ps1.mauSo * ps2.mauSo;
		p.rutgon();
		return p;
	}
	
	public PhanSo nhan(PhanSo ps1, PhanSo ps2) {
		PhanSo p = new PhanSo();
		p.tuSo = ps1.tuSo * ps2.tuSo;
		p.mauSo = ps1.mauSo * ps2.mauSo;
		p.rutgon();
		return p;
	}
	
	public PhanSo chia(PhanSo ps1, PhanSo ps2) {
		PhanSo p = new PhanSo();
		p.tuSo = ps1.tuSo * ps2.mauSo;
		p.mauSo = ps1.mauSo * ps2.tuSo;
		p.rutgon();
		return p;
	}
}
