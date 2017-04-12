package by.training.wolterskluwer.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Chapter")
public class Chapter {
	private long id;
	private int chapterNumber;
	private int pagesQuantity;

	public Chapter() {
		super();
	}

	public Chapter(long id, int chapterNumber, int pagesQuantity) {
		super();
		this.id = id;
		this.chapterNumber = chapterNumber;
		this.pagesQuantity = pagesQuantity;
	}

	public int getChapterNumber() {
		return chapterNumber;
	}

	public void setChapterNumber(int chapterNumber) {
		this.chapterNumber = chapterNumber;
	}

	public int getPagesQuantity() {
		return pagesQuantity;
	}

	public void setPagesQuantity(int pagesQuantity) {
		this.pagesQuantity = pagesQuantity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chapter other = (Chapter) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chapter [id=" + id + ", chapterNumber=" + chapterNumber + ", pagesQuantity=" + pagesQuantity + "]";
	}
}