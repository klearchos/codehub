package encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.SerializationUtils;

public class SpecialFile {

  private Integer id;
  private byte[] contents;
  private List<SpecialAttribute> attributes = new ArrayList<>();
  private Owner owner;
  private String signature;
  private int size;

  // There are multiple ways in order to accomplish the deep copy.
  // https://www.baeldung.com/java-deep-copy
  public List<SpecialAttribute> getAttributes() {
    return deepCloneAttributes(attributes);
  }

  public void setAttributes(List<SpecialAttribute> attributes) {
    this.attributes = deepCloneAttributes(attributes);
  }

  private List<SpecialAttribute> deepCloneAttributes(List<SpecialAttribute> attr) {
    return attr.stream().map(SerializationUtils::clone).collect(Collectors.toList());
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public byte[] getContents() {
    return contents.clone();
  }

  public void setContents(byte[] contents) {
    this.contents = contents.clone();
  }

  public Owner getOwner() {
    return SerializationUtils.clone(owner);
  }

  public void setOwner(Owner owner) {
    this.owner = SerializationUtils.clone(owner);
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
