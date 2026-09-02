(ns simple-billy-api.specs.product-attribute
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-attribute-data
  {
   (ds/opt :isFilterable) boolean?
   (ds/req :name) string?
   (ds/opt :position) int?
   (ds/req :productId) uuid?
   (ds/opt :unit) string?
   (ds/req :value) string?
   })

(def product-attribute-spec
  (ds/spec
    {:name ::product-attribute
     :spec product-attribute-data}))
