(ns simple-billy-api.specs.inventory-value-point
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inventory-value-point-data
  {
   (ds/req :product_count) int?
   (ds/req :recorded_at) inst?
   (ds/req :total_purchase_value) string?
   (ds/req :total_sales_value) string?
   })

(def inventory-value-point-spec
  (ds/spec
    {:name ::inventory-value-point
     :spec inventory-value-point-data}))
