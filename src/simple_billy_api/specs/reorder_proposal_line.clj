(ns simple-billy-api.specs.reorder-proposal-line
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def reorder-proposal-line-data
  {
   (ds/req :currentStock) int?
   (ds/opt :maxStock) int?
   (ds/opt :minStock) int?
   (ds/req :productId) uuid?
   (ds/req :productName) string?
   (ds/opt :reorderQuantity) int?
   (ds/req :sku) string?
   (ds/req :suggestedQuantity) int?
   })

(def reorder-proposal-line-spec
  (ds/spec
    {:name ::reorder-proposal-line
     :spec reorder-proposal-line-data}))
