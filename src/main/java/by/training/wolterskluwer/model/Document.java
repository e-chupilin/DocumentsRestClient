package by.training.wolterskluwer.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Document")
public class Document {
	private long id;
	private String name;
	private List<Chapter> chapters;

	public Document() {
		super();
	}

	private Document(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.chapters = builder.chapters;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	public boolean setChapter(Chapter chapter) {
		if (chapters == null) {
			chapters = new ArrayList<Chapter>();
		}
		return this.chapters.add(chapter);
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
		Document other = (Document) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Document [id=" + id + ", name=" + name + ", chapters=" + chapters + "]";
	}

	public static class Builder {
		private long id;
		private String name;
		private List<Chapter> chapters;

		public Builder() {
		}

		public Builder(long id) {
			this.id = id;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder addChapter(Chapter chapter) {
			if (chapters == null) {
				chapters = new ArrayList<Chapter>();
			}

			this.chapters.add(chapter);
			return this;
		}

		public Builder addChapters(List<Chapter> chapters) {
			this.chapters = chapters;
			return this;
		}

		public Document build() {
			return new Document(this);
		}
	}
}