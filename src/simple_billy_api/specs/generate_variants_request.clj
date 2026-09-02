(ns simple-billy-api.specs.generate-variants-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def generate-variants-request-data
  {
   (ds/opt :options) (s/map-of string? (s/coll-of string?))
   (ds/opt :priceDelta) string?
   (ds/req :productId) uuid?
   (ds/opt :skuPrefix) string?
   })

(def generate-variants-request-spec
  (ds/spec
    {:name ::generate-variants-request
     :spec generate-variants-request-data}))
