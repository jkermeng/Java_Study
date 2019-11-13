package dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import idao.IDao;
import jdbcutil.MysqlConnet;
import onetomanyentity.Goods;
import onetomanyentity._Classification;

public class GoodsDaoIMP implements IDao<Goods> {
	private Connection conn;
	private PreparedStatement ps;

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
				int cid = rs.getInt("classification_cid");
				Goods g = new Goods(gid, gname, gprice, gstock);
				g.setSetClassfy(new _Classification(cid));
				setgoods.add(g);
			}
			MysqlConnet.partClose();
		}

		return setgoods;
	}

	@Override
	public Goods selectById(int id) throws SQLException {
		Set<Goods> goods = select(null);
		Goods g1 = new Goods();
		for (Goods g : goods) {
			if (g.getGid() == id) {
				g1 = g;
			}
		}
		return g1;
	}

	public Set<Goods> selectByClassficationId(int classid) throws SQLException {
		Set<Goods> g = new HashSet<>();
		Set<Goods> goods = select(null);
		for (Goods gs : goods) {
			if (gs.getSetClassfy().getCid() == classid) {
				g.add(gs);
			}
		}
		return g;
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
