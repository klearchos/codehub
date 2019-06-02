package encapuslation;

import static org.junit.Assert.assertEquals;

import encapsulation.Owner;
import encapsulation.SpecialAttribute;
import encapsulation.SpecialFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class SpecialFileTest {

  @Test
  public void checkContents () {
    SpecialFile sp = new SpecialFile();
    String originalValue = "Special Contents";
    byte[] contents = originalValue.getBytes(StandardCharsets.UTF_8);
    sp.setContents(contents);

    // Client changes the referenced data.
    contents[0] = "a".getBytes()[0];

    assertEquals(originalValue, new String(sp.getContents(), StandardCharsets.UTF_8));
  }

  @Test
  public void checkAttributes() {
    SpecialFile sp = new SpecialFile();
    List<SpecialAttribute> attributeList = new ArrayList<>();
    SpecialAttribute sa = new SpecialAttribute();
    attributeList.add(sa);
    String attributeName = "attribute name";
    String attributeValue = "attribute value";
    sa.setName(attributeName);
    sa.setValue(attributeValue);
    sp.setAttributes(attributeList);

    // Client changes the referenced data.
    sa.setValue("Changed " + attributeValue);
    sa.setName("Changed " + attributeName);

    assertEquals(attributeName, sp.getAttributes().get(0).getName());
    assertEquals(attributeValue, sp.getAttributes().get(0).getValue());
  }

  @Test
  public void checkOwner() {
    SpecialFile sp = new SpecialFile();
    Owner owner = new Owner();
    String ownerName = "Owner's Name";
    String ownerSurName = "Owner's Surname";
    owner.setName(ownerName);
    owner.setSurname(ownerSurName);
    sp.setOwner(owner);

    // Client changes the referenced data.
    owner.setName("Changed - " + ownerName);
    owner.setSurname("Changed - " + ownerSurName);

    assertEquals(ownerName, sp.getOwner().getName());
    assertEquals(ownerSurName, sp.getOwner().getSurname());
  }


}
