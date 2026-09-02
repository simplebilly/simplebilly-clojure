(ns simple-billy-api.specs.reorder-proposal-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.reorder-proposal-line :refer :all]
            )
  (:import (java.io File)))


(def reorder-proposal-response-data
  {
   (ds/req :generatedAt) inst?
   (ds/req :lines) (s/coll-of reorder-proposal-line-spec)
   (ds/req :totalSuggestedQuantity) int?
   })

(def reorder-proposal-response-spec
  (ds/spec
    {:name ::reorder-proposal-response
     :spec reorder-proposal-response-data}))
