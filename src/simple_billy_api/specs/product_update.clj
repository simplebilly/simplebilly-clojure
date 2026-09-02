(ns simple-billy-api.specs.product-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def product-update-data
  {
   (ds/opt :availability) string?
   (ds/opt :barcode) string?
   (ds/opt :brand) string?
   (ds/opt :categoryId) string?
   (ds/opt :condition) string?
   (ds/opt :defaultLedgerAccount) string?
   (ds/opt :defaultPrice) string?
   (ds/opt :defaultPriceFormulaId) uuid?
   (ds/opt :defaultTaxRate) string?
   (ds/opt :description) string?
   (ds/opt :gtin) string?
   (ds/opt :height) string?
   (ds/opt :imageLink) string?
   (ds/opt :images) any-type-spec
   (ds/opt :isTaxable) boolean?
   (ds/opt :length) string?
   (ds/opt :link) string?
   (ds/opt :maxStock) int?
   (ds/opt :minStock) int?
   (ds/opt :mpn) string?
   (ds/opt :name) string?
   (ds/opt :packageHeight) string?
   (ds/opt :packageLength) string?
   (ds/opt :packageWeightUnit) string?
   (ds/opt :packageWeightValue) string?
   (ds/opt :packageWidth) string?
   (ds/opt :productCode) string?
   (ds/opt :productType) string?
   (ds/opt :purchasePrice) string?
   (ds/opt :reorderQuantity) int?
   (ds/opt :salePrice) string?
   (ds/opt :shippingPrice) string?
   (ds/opt :shippingRequiresInsurance) boolean?
   (ds/opt :sku) string?
   (ds/opt :stockQuantity) int?
   (ds/opt :tags) any-type-spec
   (ds/opt :taxPrice) string?
   (ds/opt :trackBatch) boolean?
   (ds/opt :trackSerial) boolean?
   (ds/opt :unit) any-type-spec
   (ds/opt :weightUnit) string?
   (ds/opt :weightValue) string?
   (ds/opt :width) string?
   })

(def product-update-spec
  (ds/spec
    {:name ::product-update
     :spec product-update-data}))
