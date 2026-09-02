(ns simple-billy-api.specs.generate-count-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def generate-count-request-data
  {
   (ds/opt :notes) string?
   (ds/opt :productIds) (s/coll-of uuid?)
   (ds/req :warehouseId) string?
   })

(def generate-count-request-spec
  (ds/spec
    {:name ::generate-count-request
     :spec generate-count-request-data}))
