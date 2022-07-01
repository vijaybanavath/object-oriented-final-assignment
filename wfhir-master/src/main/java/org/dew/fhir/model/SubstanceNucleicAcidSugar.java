package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceNucleicAcid_Sugar</a>
 */
public
class SubstanceNucleicAcidSugar extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier identifier;
  protected String residueSite;
  protected String name;
  
  public SubstanceNucleicAcidSugar()
  {
  }
  
  public Identifier getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }
  
  public String getResidueSite() {
    return residueSite;
  }
  
  public void setResidueSite(String residueSite) {
    this.residueSite = residueSite;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceNucleicAcidSugar) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(id == null) return 0;
    return id.hashCode();
  }
  
  @Override
  public String toString() {
    return "SubstanceNucleicAcidSugar(" + id + ")";
  }
}
