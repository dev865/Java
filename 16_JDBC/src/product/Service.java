package product;

import java.util.List;

public interface Service {

	int register(ProductVO pvo);

	List<ProductVO> list();

	ProductVO detail(int pno);

	int edit(ProductVO pvo);

	int remove(int pno);

}
