library q3
using FHIR version '4.0.0'
include FHIRHelpers version '4.0.0'

codesystem SampleMaterialType: 'https://fhir.bbmri.de/CodeSystem/SampleMaterialType'

context Specimen

define InInitialPopulation:
  Specimen.type ~ Code 'whole-blood' from SampleMaterialType
