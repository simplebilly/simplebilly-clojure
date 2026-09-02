(ns simple-billy-api.specs.api-response-team
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.api-response-team-data :refer :all]
            )
  (:import (java.io File)))


(def api-response-team-data
  {
   (ds/opt :data) api-response-team-data-spec
   (ds/opt :error) string?
   (ds/opt :message) string?
   (ds/req :success) boolean?
   })

(def api-response-team-spec
  (ds/spec
    {:name ::api-response-team
     :spec api-response-team-data}))
