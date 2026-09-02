(ns simple-billy-api.specs.new-version-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def new-version-request-data
  {
   (ds/req :fileName) string?
   (ds/opt :fileSize) int?
   (ds/opt :mimeType) string?
   (ds/opt :originalName) string?
   (ds/opt :sha256Hash) string?
   })

(def new-version-request-spec
  (ds/spec
    {:name ::new-version-request
     :spec new-version-request-data}))
