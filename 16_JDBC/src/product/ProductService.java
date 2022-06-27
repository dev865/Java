package product;

import java.util.List;

public class ProductService implements Service {
	private DAO dao;
	
	public ProductService() {
		dao = new ProductDAO();
	}

	@Override
	public int register(ProductVO pvo) {
		return dao.insert(pvo);
	}

	@Override
	public List<ProductVO> list() {
		return dao.selectList();
	}

	@Override
	public ProductVO detail(int pno) {
		return dao.selectOne(pno);
	}

	@Override
	public int edit(ProductVO pvo) {
		return dao.update(pvo);
	}

	@Override
	public int remove(int pno) {
		return dao.delete(pno);
	}

}
