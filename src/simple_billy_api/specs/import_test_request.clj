(ns simple-billy-api.specs.import-test-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def import-test-request-data
  {
   (ds/req :apiKey) string?
   (ds/req :provider) string?
   })

(def import-test-request-spec
  (ds/spec
    {:name ::import-test-request
     :spec import-test-request-data}))
