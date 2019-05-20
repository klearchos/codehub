package encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialFile {

  private Integer id;
  private byte[] contents;
  private List<SpecialAttribute> attributes = new ArrayList<>();
  private Owner owner;
  private String signature;
  private int size;

  public List<SpecialAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<SpecialAttribute> attributes) {
    this.attributes = attributes;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public byte[] getContents() {
    return contents;
  }

  public void setContents(byte[] contents) {
    this.contents = contents;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return "SpecialFile{" +
        "id=" + id +
        ", contents=" + Arrays.toString(contents) +
        ", attributes=" + attributes +
        ", owner=" + owner +
        ", signature='" + signature + '\'' +
        ", size=" + size +
        '}';
  }
}
