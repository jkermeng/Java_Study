package dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import idao.IDao;
import jdbcutil.MysqlConnet;
import onetomanyentity.Goods;

public class GoodsDaoIMP implements IDao<Goods> {
	private Connection conn;
	private PreparedStatement ps;

	public GoodsDaoIMP() {
		super();
	}


	@Override
	public Set<Goods> select(Goods t) throws SQLException {
		conn = MysqlConnet.Connect();
		Set<Goods> setgoods = new HashSet<>();
		if (t == null) {
			String sql = "select * from goods";
			ResultSet rs = null;
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				String gname = rs.getString("gname");
				double gprice = rs.getDouble("gprice");
				int gid = rs.getInt("gid");
				int gstock = rs.getInt("gstock");
				int classification_cid = rs.getInt("classification_cid");
				Goods g = new Goods(gid, gname, gprice, gstock, classification_cid);
				setgoods.add(g);
			}
		}

		return setgoods;
	}

	@Override
	public Goods selectById(int id) {
		return null;
	}

	@Override
	public void update() {

	}

	@Override
	public void delete() {

	}

	@Override
	public void isExist() {

	}

}
