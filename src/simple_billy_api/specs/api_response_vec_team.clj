(ns simple-billy-api.specs.api-response-vec-team
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.api-response-team-data :refer :all]
            )
  (:import (java.io File)))


(def api-response-vec-team-data
  {
   (ds/opt :data) (s/coll-of api-response-team-data-spec)
   (ds/opt :error) string?
   (ds/opt :message) string?
   (ds/req :success) boolean?
   })

(def api-response-vec-team-spec
  (ds/spec
    {:name ::api-response-vec-team
     :spec api-response-vec-team-data}))
