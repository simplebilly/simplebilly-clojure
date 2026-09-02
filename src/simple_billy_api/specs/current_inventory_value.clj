(ns simple-billy-api.specs.current-inventory-value
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.inventory-value-point :refer :all]
            )
  (:import (java.io File)))


(def current-inventory-value-data
  {
   (ds/req :history) (s/coll-of inventory-value-point-spec)
   (ds/req :product_count) int?
   (ds/req :total_purchase_value) string?
   (ds/req :total_sales_value) string?
   })

(def current-inventory-value-spec
  (ds/spec
    {:name ::current-inventory-value
     :spec current-inventory-value-data}))
