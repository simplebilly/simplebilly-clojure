(ns simple-billy-api.specs.product-variant-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def product-variant-update-data
  {
   (ds/opt :barcode) string?
   (ds/opt :imageLink) string?
   (ds/opt :isActive) boolean?
   (ds/opt :name) string?
   (ds/opt :optionValues) any-type-spec
   (ds/opt :price) string?
   (ds/opt :priceDelta) string?
   (ds/opt :productId) uuid?
   (ds/opt :sku) string?
   (ds/opt :stockQuantity) int?
   })

(def product-variant-update-spec
  (ds/spec
    {:name ::product-variant-update
     :spec product-variant-update-data}))
