(ns simple-billy-api.specs.production-order-costing
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.costing-line :refer :all]
            )
  (:import (java.io File)))


(def production-order-costing-data
  {
   (ds/req :costPerUnit) string?
   (ds/req :costSource) string?
   (ds/req :lines) (s/coll-of costing-line-spec)
   (ds/opt :marginPerUnit) string?
   (ds/opt :marginPercent) string?
   (ds/req :materialCostTotal) string?
   (ds/req :orderNumber) string?
   (ds/req :productionOrderId) uuid?
   (ds/req :quantity) int?
   (ds/opt :salePrice) string?
   (ds/req :status) string?
   })

(def production-order-costing-spec
  (ds/spec
    {:name ::production-order-costing
     :spec production-order-costing-data}))
