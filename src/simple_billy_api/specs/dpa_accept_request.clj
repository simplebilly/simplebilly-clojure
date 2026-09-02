(ns simple-billy-api.specs.dpa-accept-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def dpa-accept-request-data
  {
   (ds/req :acceptedByName) string?
   (ds/req :version) string?
   })

(def dpa-accept-request-spec
  (ds/spec
    {:name ::dpa-accept-request
     :spec dpa-accept-request-data}))
