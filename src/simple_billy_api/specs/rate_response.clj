(ns simple-billy-api.specs.rate-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.shipping-rate :refer :all]
            )
  (:import (java.io File)))


(def rate-response-data
  {
   (ds/req :rates) (s/coll-of shipping-rate-spec)
   })

(def rate-response-spec
  (ds/spec
    {:name ::rate-response
     :spec rate-response-data}))
