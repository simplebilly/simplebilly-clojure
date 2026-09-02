(ns simple-billy-api.specs.product-variant-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def product-variant-create-data
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

(def product-variant-create-spec
  (ds/spec
    {:name ::product-variant-create
     :spec product-variant-create-data}))
