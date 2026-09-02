(ns simple-billy-api.specs.product-attribute-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-attribute-update-data
  {
   (ds/opt :isFilterable) boolean?
   (ds/opt :name) string?
   (ds/opt :position) int?
   (ds/opt :productId) uuid?
   (ds/opt :unit) string?
   (ds/opt :value) string?
   })

(def product-attribute-update-spec
  (ds/spec
    {:name ::product-attribute-update
     :spec product-attribute-update-data}))
