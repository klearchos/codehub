package ood.texteditor;

import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Plugin implements Serializable {

  private static final long serialVersionUID = 1L;

  private final String name;
  private final String url;

  public Plugin(String name, String url) {
    this.name = name;
    this.url = url;
  }

  public String getName() {
    return name;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Plugin plugin = (Plugin) o;

    return new EqualsBuilder()
        .append(name, plugin.name)
        .append(url, plugin.url)
        .isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
        .append(name)
        .append(url)
        .toHashCode();
  }

  @Override
  public String toString() {
    return "Plugin{" +
        "name='" + name + '\'' +
        ", url='" + url + '\'' +
        '}';
  }
}
