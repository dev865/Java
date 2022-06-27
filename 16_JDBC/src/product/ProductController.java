package product;

import java.util.List;
import java.util.Scanner;

public class ProductController {
	// 상품등록, 상품리스트, 상품상세, 상품수정, 상품삭제
	// 데이터베이스 연동한 후 컨트롤러에서 모든 메뉴 분기 처리
	// 서비스는 컨트롤러에서 호출, DAO는 서비스가 호출
	private Scanner sc;
	private Service svc;
	private boolean flag;
	
	public ProductController() {
		sc = new Scanner(System.in);
		svc = new ProductService();
		flag = true;
		printMenu();
	}

	private void printMenu() {
		while (flag) {
			System.out.println("--------------상품 관리 시스템-------------");
			System.out.println("1:등록 2:목록 3:찾기 4:수정 5:삭제 Etc:종료");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				register();
				break;
			case 2:
				list();
				break;
			case 3:
				detail();
				break;
			case 4:
				edit();
				break;
			case 5:
				remove();
				break;
			default:
				flag = false;
				break;
			}
		}
	}

	private void remove() {
		System.out.println("상품 번호 > ");
		int pno = sc.nextInt();
		int isOk = svc.remove(pno);
		System.out.println("상품 삭제 " + (isOk > 0 ? "성공" : "실패"));
	}

	private void edit() {
		System.out.println("상품 번호 > ");
		int pno = sc.nextInt();
		System.out.println("상품 이름 > ");
		String pname = sc.next();
		System.out.println("상품 가격 > ");
		int price = sc.nextInt();
		System.out.println("상품 제조자 > ");
		String madeby = sc.next();
		int isOk = svc.edit(new ProductVO(pno, pname, price, madeby));
		System.out.println("상품 수정 " + (isOk > 0 ? "성공" : "실패"));
	}

	private void detail() {
		System.out.println("상품 번호 > ");
		int pno = sc.nextInt();
		ProductVO pvo = svc.detail(pno);
		System.out.println(pvo);
	}

	private void list() {
		List<ProductVO> list = svc.list();
		for (ProductVO pvo : list) {
			System.out.println(pvo);
		}
	}

	private void register() {
		System.out.println("상품 이름 > ");
		String pname = sc.next();
		System.out.println("상품 가격 > ");
		int price = sc.nextInt();
		System.out.println("상품 제조자 > ");
		String madeby = sc.next();
		int isOk = svc.register(new ProductVO(pname, price, madeby));
		System.out.println("상품 등록 " + (isOk > 0 ? "성공" : "실패"));
	}
}
