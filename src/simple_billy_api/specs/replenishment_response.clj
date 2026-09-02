(ns simple-billy-api.specs.replenishment-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.replenishment-suggestion-line :refer :all]
            )
  (:import (java.io File)))


(def replenishment-response-data
  {
   (ds/req :generatedAt) inst?
   (ds/req :lines) (s/coll-of replenishment-suggestion-line-spec)
   (ds/req :targetWarehouseId) string?
   (ds/req :totalSuggestedQuantity) int?
   })

(def replenishment-response-spec
  (ds/spec
    {:name ::replenishment-response
     :spec replenishment-response-data}))
