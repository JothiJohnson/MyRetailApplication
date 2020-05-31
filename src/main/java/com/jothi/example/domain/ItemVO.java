
package com.jothi.example.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tcin",
    "bundle_components",
    "dpci",
    "upc",
    "product_description",
    "buy_url",
    "enrichment",
    "return_method",
    "handling",
    "recall_compliance",
    "tax_category",
    "display_option",
    "fulfillment",
    "package_dimensions",
    "environmental_segmentation",
    "manufacturer",
    "product_vendors",
    "product_classification",
    "product_brand",
    "item_state",
    "specifications",
    "attributes",
    "country_of_origin",
    "relationship_type_code",
    "subscription_eligible",
    "ribbons",
    "tags",
    "ship_to_restriction",
    "estore_item_status_code",
    "is_proposition_65",
    "return_policies",
    "packaging"
})
public class ItemVO implements Serializable
{

    @JsonProperty("tcin")
    private String tcin;
    @JsonProperty("bundle_components")
    private BundleComponentsVO bundleComponents;
    @JsonProperty("dpci")
    private String dpci;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("product_description")
    private ProductDescriptionVO productDescription;
    @JsonProperty("buy_url")
    private String buyUrl;
    @JsonProperty("enrichment")
    private EnrichmentVO enrichment;
    @JsonProperty("return_method")
    private String returnMethod;
    @JsonProperty("handling")
    private HandlingVO handling;
    @JsonProperty("recall_compliance")
    private RecallComplianceVO recallCompliance;
    @JsonProperty("tax_category")
    private TaxCategoryVO taxCategory;
    @JsonProperty("display_option")
    private DisplayOptionVO displayOption;
    @JsonProperty("fulfillment")
    private FulfillmentVO fulfillment;
    @JsonProperty("package_dimensions")
    private PackageDimensionsVO packageDimensions;
    @JsonProperty("environmental_segmentation")
    private EnvironmentalSegmentationVO environmentalSegmentation;
    @JsonProperty("manufacturer")
    private ManufacturerVO manufacturer;
    @JsonProperty("product_vendors")
    private List<ProductVendorVO> productVendors = null;
    @JsonProperty("product_classification")
    private ProductClassificationVO productClassification;
    @JsonProperty("product_brand")
    private ProductBrandVO productBrand;
    @JsonProperty("item_state")
    private String itemState;
    @JsonProperty("specifications")
    private List<Object> specifications = null;
    @JsonProperty("attributes")
    private AttributesVO attributes;
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    @JsonProperty("relationship_type_code")
    private String relationshipTypeCode;
    @JsonProperty("subscription_eligible")
    private Boolean subscriptionEligible;
    @JsonProperty("ribbons")
    private List<Object> ribbons = null;
    @JsonProperty("tags")
    private List<Object> tags = null;
    @JsonProperty("ship_to_restriction")
    private String shipToRestriction;
    @JsonProperty("estore_item_status_code")
    private String estoreItemStatusCode;
    @JsonProperty("is_proposition_65")
    private Boolean isProposition65;
    @JsonProperty("return_policies")
    private ReturnPoliciesVO returnPolicies;
    @JsonProperty("packaging")
    private PackagingVO packaging;
    private final static long serialVersionUID = -2017051802754844033L;

    @JsonProperty("tcin")
    public String getTcin() {
        return tcin;
    }

    @JsonProperty("tcin")
    public void setTcin(String tcin) {
        this.tcin = tcin;
    }

    @JsonProperty("bundle_components")
    public BundleComponentsVO getBundleComponents() {
        return bundleComponents;
    }

    @JsonProperty("bundle_components")
    public void setBundleComponents(BundleComponentsVO bundleComponents) {
        this.bundleComponents = bundleComponents;
    }

    @JsonProperty("dpci")
    public String getDpci() {
        return dpci;
    }

    @JsonProperty("dpci")
    public void setDpci(String dpci) {
        this.dpci = dpci;
    }

    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    @JsonProperty("product_description")
    public ProductDescriptionVO getProductDescription() {
        return productDescription;
    }

    @JsonProperty("product_description")
    public void setProductDescription(ProductDescriptionVO productDescription) {
        this.productDescription = productDescription;
    }

    @JsonProperty("buy_url")
    public String getBuyUrl() {
        return buyUrl;
    }

    @JsonProperty("buy_url")
    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
    }

    @JsonProperty("enrichment")
    public EnrichmentVO getEnrichment() {
        return enrichment;
    }

    @JsonProperty("enrichment")
    public void setEnrichment(EnrichmentVO enrichment) {
        this.enrichment = enrichment;
    }

    @JsonProperty("return_method")
    public String getReturnMethod() {
        return returnMethod;
    }

    @JsonProperty("return_method")
    public void setReturnMethod(String returnMethod) {
        this.returnMethod = returnMethod;
    }

    @JsonProperty("handling")
    public HandlingVO getHandling() {
        return handling;
    }

    @JsonProperty("handling")
    public void setHandling(HandlingVO handling) {
        this.handling = handling;
    }

    @JsonProperty("recall_compliance")
    public RecallComplianceVO getRecallCompliance() {
        return recallCompliance;
    }

    @JsonProperty("recall_compliance")
    public void setRecallCompliance(RecallComplianceVO recallCompliance) {
        this.recallCompliance = recallCompliance;
    }

    @JsonProperty("tax_category")
    public TaxCategoryVO getTaxCategory() {
        return taxCategory;
    }

    @JsonProperty("tax_category")
    public void setTaxCategory(TaxCategoryVO taxCategory) {
        this.taxCategory = taxCategory;
    }

    @JsonProperty("display_option")
    public DisplayOptionVO getDisplayOption() {
        return displayOption;
    }

    @JsonProperty("display_option")
    public void setDisplayOption(DisplayOptionVO displayOption) {
        this.displayOption = displayOption;
    }

    @JsonProperty("fulfillment")
    public FulfillmentVO getFulfillment() {
        return fulfillment;
    }

    @JsonProperty("fulfillment")
    public void setFulfillment(FulfillmentVO fulfillment) {
        this.fulfillment = fulfillment;
    }

    @JsonProperty("package_dimensions")
    public PackageDimensionsVO getPackageDimensions() {
        return packageDimensions;
    }

    @JsonProperty("package_dimensions")
    public void setPackageDimensions(PackageDimensionsVO packageDimensions) {
        this.packageDimensions = packageDimensions;
    }

    @JsonProperty("environmental_segmentation")
    public EnvironmentalSegmentationVO getEnvironmentalSegmentation() {
        return environmentalSegmentation;
    }

    @JsonProperty("environmental_segmentation")
    public void setEnvironmentalSegmentation(EnvironmentalSegmentationVO environmentalSegmentation) {
        this.environmentalSegmentation = environmentalSegmentation;
    }

    @JsonProperty("manufacturer")
    public ManufacturerVO getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("manufacturer")
    public void setManufacturer(ManufacturerVO manufacturer) {
        this.manufacturer = manufacturer;
    }

    @JsonProperty("product_vendors")
    public List<ProductVendorVO> getProductVendors() {
        return productVendors;
    }

    @JsonProperty("product_vendors")
    public void setProductVendors(List<ProductVendorVO> productVendors) {
        this.productVendors = productVendors;
    }

    @JsonProperty("product_classification")
    public ProductClassificationVO getProductClassification() {
        return productClassification;
    }

    @JsonProperty("product_classification")
    public void setProductClassification(ProductClassificationVO productClassification) {
        this.productClassification = productClassification;
    }

    @JsonProperty("product_brand")
    public ProductBrandVO getProductBrand() {
        return productBrand;
    }

    @JsonProperty("product_brand")
    public void setProductBrand(ProductBrandVO productBrand) {
        this.productBrand = productBrand;
    }

    @JsonProperty("item_state")
    public String getItemState() {
        return itemState;
    }

    @JsonProperty("item_state")
    public void setItemState(String itemState) {
        this.itemState = itemState;
    }

    @JsonProperty("specifications")
    public List<Object> getSpecifications() {
        return specifications;
    }

    @JsonProperty("specifications")
    public void setSpecifications(List<Object> specifications) {
        this.specifications = specifications;
    }

    @JsonProperty("attributes")
    public AttributesVO getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(AttributesVO attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("country_of_origin")
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @JsonProperty("country_of_origin")
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @JsonProperty("relationship_type_code")
    public String getRelationshipTypeCode() {
        return relationshipTypeCode;
    }

    @JsonProperty("relationship_type_code")
    public void setRelationshipTypeCode(String relationshipTypeCode) {
        this.relationshipTypeCode = relationshipTypeCode;
    }

    @JsonProperty("subscription_eligible")
    public Boolean getSubscriptionEligible() {
        return subscriptionEligible;
    }

    @JsonProperty("subscription_eligible")
    public void setSubscriptionEligible(Boolean subscriptionEligible) {
        this.subscriptionEligible = subscriptionEligible;
    }

    @JsonProperty("ribbons")
    public List<Object> getRibbons() {
        return ribbons;
    }

    @JsonProperty("ribbons")
    public void setRibbons(List<Object> ribbons) {
        this.ribbons = ribbons;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("ship_to_restriction")
    public String getShipToRestriction() {
        return shipToRestriction;
    }

    @JsonProperty("ship_to_restriction")
    public void setShipToRestriction(String shipToRestriction) {
        this.shipToRestriction = shipToRestriction;
    }

    @JsonProperty("estore_item_status_code")
    public String getEstoreItemStatusCode() {
        return estoreItemStatusCode;
    }

    @JsonProperty("estore_item_status_code")
    public void setEstoreItemStatusCode(String estoreItemStatusCode) {
        this.estoreItemStatusCode = estoreItemStatusCode;
    }

    @JsonProperty("is_proposition_65")
    public Boolean getIsProposition65() {
        return isProposition65;
    }

    @JsonProperty("is_proposition_65")
    public void setIsProposition65(Boolean isProposition65) {
        this.isProposition65 = isProposition65;
    }

    @JsonProperty("return_policies")
    public ReturnPoliciesVO getReturnPolicies() {
        return returnPolicies;
    }

    @JsonProperty("return_policies")
    public void setReturnPolicies(ReturnPoliciesVO returnPolicies) {
        this.returnPolicies = returnPolicies;
    }

    @JsonProperty("packaging")
    public PackagingVO getPackaging() {
        return packaging;
    }

    @JsonProperty("packaging")
    public void setPackaging(PackagingVO packaging) {
        this.packaging = packaging;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tcin", tcin).append("bundleComponents", bundleComponents).append("dpci", dpci).append("upc", upc).append("productDescription", productDescription).append("buyUrl", buyUrl).append("enrichment", enrichment).append("returnMethod", returnMethod).append("handling", handling).append("recallCompliance", recallCompliance).append("taxCategory", taxCategory).append("displayOption", displayOption).append("fulfillment", fulfillment).append("packageDimensions", packageDimensions).append("environmentalSegmentation", environmentalSegmentation).append("manufacturer", manufacturer).append("productVendors", productVendors).append("productClassification", productClassification).append("productBrand", productBrand).append("itemState", itemState).append("specifications", specifications).append("attributes", attributes).append("countryOfOrigin", countryOfOrigin).append("relationshipTypeCode", relationshipTypeCode).append("subscriptionEligible", subscriptionEligible).append("ribbons", ribbons).append("tags", tags).append("shipToRestriction", shipToRestriction).append("estoreItemStatusCode", estoreItemStatusCode).append("isProposition65", isProposition65).append("returnPolicies", returnPolicies).append("packaging", packaging).toString();
    }

}
