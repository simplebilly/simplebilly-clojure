(ns simple-billy-api.specs.tracking-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.tracking-event :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def tracking-info-data
  {
   (ds/req :carrier) string?
   (ds/opt :estimated_delivery) string?
   (ds/req :events) (s/coll-of tracking-event-spec)
   (ds/opt :raw_response) any-type-spec
   (ds/req :status) string?
   (ds/req :tracking_number) string?
   })

(def tracking-info-spec
  (ds/spec
    {:name ::tracking-info
     :spec tracking-info-data}))
