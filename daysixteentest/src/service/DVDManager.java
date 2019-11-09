package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.DoubleAdder;

import dao.DVDDao;
import entity.DVD;
import util.UDataForm;

public class DVDManager {
	private static DVDDao dvddao;

	public DVDManager() throws IOException, ClassNotFoundException {
		dvddao = new DVDDao();
	}

	public int addDVD(DVD dvd) {
		try {
			dvddao.addDist(dvd);
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
		return 1;

	}

	public DVD[] selectDVD() throws ClassNotFoundException, IOException {

		return dvddao.selectDistDVD();

	}

	public int deleteDVD(DVD dvd) {
		try {
			dvddao.deleteDistDVD(dvd);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			return -1;

		}
		return 1;
	}

	public int lendDVD(DVD dvd) {
		DVD[] selectDistDVD;
		try {
			selectDistDVD = dvddao.selectDistDVD();
			for (DVD dvd2 : selectDistDVD) {
				if (dvd2.getId() == dvd.getId()) {
					dvd2.setLendCount(dvd2.getLendCount() + 1);
					dvd2.setLendDate(UDataForm.StrToDate(new Date(), "YYYY-MM-dd"));
					dvd2.setStatus("ря╫ХЁЖ");
					dvddao.addDist(dvd2);
				}
			}
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			return -1;

		}
		return 1;
	}

	public int borrowDVD(DVD dvd) {
		DVD[] selectDistDVD;
		try {
			selectDistDVD = dvddao.selectDistDVD();
			for (DVD dvd2 : selectDistDVD) {
				if (dvd2.getId() == dvd.getId()) {
					dvd2.setStatus("©и╫Х");
					dvd2.setLendDate(null);
					dvddao.addDist(dvd2);

				}
			}
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			return -1;
		}

		return 1;

	}
}
