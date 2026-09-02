(ns simple-billy-api.specs.costing-line
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def costing-line-data
  {
   (ds/req :lineCost) string?
   (ds/req :name) string?
   (ds/req :productId) uuid?
   (ds/req :quantityPerUnit) int?
   (ds/req :sku) string?
   (ds/req :totalQuantity) int?
   (ds/opt :unitPurchasePrice) string?
   })

(def costing-line-spec
  (ds/spec
    {:name ::costing-line
     :spec costing-line-data}))
