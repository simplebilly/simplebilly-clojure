(ns simple-billy-api.specs.product-variant
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def product-variant-data
  {
   (ds/opt :barcode) string?
   (ds/opt :imageLink) string?
   (ds/opt :isActive) boolean?
   (ds/opt :name) string?
   (ds/opt :optionValues) any-type-spec
   (ds/opt :price) string?
   (ds/opt :priceDelta) string?
   (ds/req :productId) uuid?
   (ds/req :sku) string?
   (ds/opt :stockQuantity) int?
   })

(def product-variant-spec
  (ds/spec
    {:name ::product-variant
     :spec product-variant-data}))
