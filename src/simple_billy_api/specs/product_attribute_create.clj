(ns simple-billy-api.specs.product-attribute-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-attribute-create-data
  {
   (ds/opt :isFilterable) boolean?
   (ds/req :name) string?
   (ds/opt :position) int?
   (ds/req :productId) uuid?
   (ds/opt :unit) string?
   (ds/req :value) string?
   })

(def product-attribute-create-spec
  (ds/spec
    {:name ::product-attribute-create
     :spec product-attribute-create-data}))
