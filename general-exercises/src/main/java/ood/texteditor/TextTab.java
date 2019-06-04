package ood.texteditor;

import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class TextTab implements Serializable {

  private static final long serialVersionUID = 1L;

  private String title;
  private String name;

  public TextTab(String name, String title) {
    this.title = title;
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    TextTab textTab = (TextTab) o;

    return new EqualsBuilder()
        .append(title, textTab.title)
        .append(name, textTab.name)
        .isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
        .append(title)
        .append(name)
        .toHashCode();
  }

  @Override
  public String toString() {
    return "TextTab{" +
        "title='" + title + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
